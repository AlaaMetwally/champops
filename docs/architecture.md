# ChampOps Architecture

## Goal

ChampOps is a championship operations platform.
First sport: Inline Freestyle Skating.

## Application roles

- Admin
- Coach
- Athlete
- Judge

## Architecture approach

We start with a modular monolith.
Later, we can split modules into microservices.

### Why start with a modular monolith

- Faster to build and learn
- Easier to test
- Clear module boundaries first
- Lower operations cost at the beginning

### Later microservices direction

Possible future services:

- identity-service
- athlete-service
- competition-service
- judging-service
- rules-service

We split only when module boundaries are clear and needed.

## Technology choices

- Backend: Java + Spring Boot + Maven
- Frontend: Angular
- Database: PostgreSQL
- Cache: Redis (later)
- Containers: Docker
- Orchestration: Kubernetes (later)

## Core domains (first version)

1. Identity and roles
2. Athletes and coaches
3. Competitions and schedule
4. Judging and scoring
5. Rules for Inline Freestyle Skating

## Non-goals for version 1

- Full multi-sport support
- Kubernetes production cluster
- Complex payment systems
- Ministry-specific workflows

## Success for the next milestone

- Backend project created with Maven
- Frontend project created with Angular
- Basic health endpoint working
- Project runs locally in a simple way