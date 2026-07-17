import {
    BrowserRouter,
    Routes,
    Route,
    Link,
    Navigate
} from "react-router-dom";

import Home from "./components/Home";
import TrainersList from "./components/TrainersList";
import TrainerDetails from "./components/TrainerDetails";

function App() {

    return (

        <BrowserRouter>

            <h1>Trainer Management</h1>

            <nav>

                <Link to="/home">Home</Link>

                {" | "}

                <Link to="/trainers">Trainers</Link>

            </nav>

            <hr />

            <Routes>

                <Route
                    path="/"
                    element={<Navigate to="/home" />}
                />

                <Route
                    path="/home"
                    element={<Home />}
                />

                <Route
                    path="/trainers"
                    element={<TrainersList />}
                />

                <Route
                    path="/trainers/:id"
                    element={<TrainerDetails />}
                />

            </Routes>

        </BrowserRouter>

    );

}

export default App;