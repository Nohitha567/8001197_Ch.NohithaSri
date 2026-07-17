import React from "react";
import ListOfPlayers from "./ListOfPlayers";
import IndianPlayers from "./IndianPlayers";

function App() {

    const flag = true;

    return (
        <div>

            <h1>Cricket Application</h1>

            {flag ? <ListOfPlayers /> : <IndianPlayers />}

        </div>
    );
}

export default App;