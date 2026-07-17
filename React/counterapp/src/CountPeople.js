import React, { Component } from "react";

class CountPeople extends Component {

    constructor() {
        super();

        this.state = {
            entryCount: 0,
            exitCount: 0
        };
    }

    UpdateEntry = () => {
        this.setState((prevState) => ({
            entryCount: prevState.entryCount + 1
        }));
    };

    UpdateExit = () => {
        this.setState((prevState) => ({
            exitCount: prevState.exitCount + 1
        }));
    };

    render() {
        return (
            <div style={{ textAlign: "center", marginTop: "50px" }}>

                <button onClick={this.UpdateEntry}>
                    Login
                </button>

                <span style={{ marginLeft: "10px", marginRight: "40px" }}>
                    {this.state.entryCount} People Entered!!
                </span>

                <button onClick={this.UpdateExit}>
                    Exit
                </button>

                <span style={{ marginLeft: "10px" }}>
                    {this.state.exitCount} People Left!!
                </span>

            </div>
        );
    }
}

export default CountPeople;