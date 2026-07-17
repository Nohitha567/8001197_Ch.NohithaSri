import React, { Component } from "react";
import GuestPage from "./GuestPage";
import UserPage from "./UserPage";

class App extends Component {

    constructor() {
        super();

        this.state = {
            isLoggedIn: false
        };
    }

    login = () => {
        this.setState({
            isLoggedIn: true
        });
    };

    logout = () => {
        this.setState({
            isLoggedIn: false
        });
    };

    render() {

        return (

            <div style={{ margin: "30px" }}>

                <h1>Ticket Booking Application</h1>

                {this.state.isLoggedIn ? (

                    <div>

                        <button onClick={this.logout}>
                            Logout
                        </button>

                        <hr />

                        <UserPage />

                    </div>

                ) : (

                    <div>

                        <button onClick={this.login}>
                            Login
                        </button>

                        <hr />

                        <GuestPage />

                    </div>

                )}

            </div>

        );

    }

}

export default App;