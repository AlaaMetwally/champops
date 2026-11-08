import { Component, signal } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  imports: [],
  templateUrl: './app.html',
  styleUrl: './app.scss',
})
export class App {
  protected readonly title = signal('ChampOps');
  protected readonly healthStatus = signal('Not checked yet');

  constructor(private readonly http: HttpClient) {}

  checkBackendHealth(): void {
    this.healthStatus.set('Checking...');

    this.http.get<{ status: string; service: string }>('http://localhost:8080/api/health')
      .subscribe({
        next: (response) => {
          this.healthStatus.set(`${response.status} (${response.service})`);
        },
        error: () => {
          this.healthStatus.set('DOWN - start backend on port 8080');
        },
      });
  }
}