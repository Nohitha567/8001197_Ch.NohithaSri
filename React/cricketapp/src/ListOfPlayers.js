import React from "react";

function ListOfPlayers() {

    const players = [
        { name: "Virat", score: 95 },
        { name: "Rohit", score: 80 },
        { name: "Gill", score: 65 },
        { name: "KL Rahul", score: 72 },
        { name: "Hardik", score: 68 },
        { name: "Jadeja", score: 75 },
        { name: "Ashwin", score: 55 },
        { name: "Bumrah", score: 90 },
        { name: "Siraj", score: 60 },
        { name: "Shami", score: 78 },
        { name: "Iyer", score: 82 }
    ];

    const lowScorers = players.filter(player => player.score < 70);

    return (
        <div>

            <h2>List of Players</h2>

            <table border="1" cellPadding="8">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>Score</th>
                    </tr>
                </thead>

                <tbody>
                    {players.map((player, index) => (
                        <tr key={index}>
                            <td>{player.name}</td>
                            <td>{player.score}</td>
                        </tr>
                    ))}
                </tbody>
            </table>

            <h3>Players with Score Below 70</h3>

            <ul>
                {lowScorers.map((player, index) => (
                    <li key={index}>
                        {player.name} - {player.score}
                    </li>
                ))}
            </ul>

        </div>
    );
}

export default ListOfPlayers;