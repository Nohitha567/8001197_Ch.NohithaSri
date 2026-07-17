import React, { Component } from "react";
import GitClient from "./GitClient";

class App extends Component {

    constructor() {
        super();

        this.state = {
            repos: []
        };
    }

    async componentDidMount() {

        const repos =
            await GitClient.getRepositories("techiesyed");

        this.setState({
            repos
        });

    }

    render() {

        return (

            <div style={{ margin: "30px" }}>

                <h1>GitHub Repositories</h1>

                <ul>

                    {this.state.repos.map((repo, index) => (

                        <li key={index}>
                            {repo}
                        </li>

                    ))}

                </ul>

            </div>

        );

    }

}

export default App;