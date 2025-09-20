# GridGladiators-React-Java-Tic-Tac-Toe-Tournament

A web-based tic-tac-toe tournament application using React for the front-end and Java Spring Boot for the back-end.

## Tech Stack
- Java (Spring Boot)
- Spring WebSocket
- H2 Database (JPA)
- React
- WebSocket API

## Requirements
- Provide REST endpoint to create and fetch games (Use @RestController and JpaRepository)
- Persist game state transitions in a relational DB (Configure H2 or another JPA datasource)
- Broadcast moves in real time to all clients (Use Spring WebSocketHandler and JS WebSocket API)
- Build UI to display and update the game board (Manage state in React with useState/useEffect)
- Validate win/draw conditions on the server (Implement simple tic-tac-toe logic in Java service)

## Installation

### Back-end
1. Install Java 11+ and Maven
2. Clone the repo and navigate to `server`
3. (Optional) Configure environment variables:
   - `SPRING_DATASOURCE_URL` (default: `jdbc:h2:mem:tic_tac_toe`)
   - `SPRING_DATASOURCE_USERNAME`
   - `SPRING_DATASOURCE_PASSWORD`
4. Run:
   bash
   mvn clean install
   

### Front-end
1. Install Node.js 14+
2. Navigate to `client`
3. Install dependencies:
   bash
   npm install
   

## Usage
1. Start the back-end:
   bash
   cd server
   mvn spring-boot:run
   
2. Start the front-end:
   bash
   cd client
   npm start
   
3. Open your browser at `http://localhost:3000` to create or join tic-tac-toe games.

## Implementation Steps
1. Initialize a Spring Boot project with Web, JPA, and WebSocket dependencies.
2. Define a `Game` entity and a `GameRepository` interface extending `JpaRepository`.
3. Create a `GameController` annotated with `@RestController` to expose REST endpoints for creating and fetching games.
4. Configure the H2 datasource in `application.properties` for in-memory persistence.
5. Implement a `TicTacToeService` to process moves and validate win/draw conditions.
6. Set up a `WebSocketHandler` in Spring to broadcast move events to connected clients.
7. Scaffold a React application (using `create-react-app`) with components for the game lobby and board.
8. Use the browser WebSocket API in React to connect to the Spring WebSocket server.
9. Manage board state with `useState` and synchronize updates in `useEffect` based on WebSocket messages.
10. Test end-to-end: REST game creation, real-time move broadcasting, and persistence in H2.

## API Endpoints
- **POST** `/api/games` — Create a new game. Returns game ID and initial state.
- **GET** `/api/games` — List all games and their statuses.
- **GET** `/api/games/{gameId}` — Fetch the current state of a specific game.
- **WebSocket** `ws://localhost:8080/game` — Subscribe to and publish move events in real time.