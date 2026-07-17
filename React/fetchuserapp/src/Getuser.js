import React, { Component } from "react";

class Getuser extends Component {

    constructor() {
        super();

        this.state = {
            title: "",
            firstName: "",
            image: "",
            loading: true
        };
    }

    async componentDidMount() {

        try {

            const response = await fetch("https://api.randomuser.me/");

            const data = await response.json();

            const user = data.results[0];

            this.setState({
                title: user.name.title,
                firstName: user.name.first,
                image: user.picture.large,
                loading: false
            });

        } catch (error) {
            console.log(error);
        }
    }

    render() {

        if (this.state.loading) {
            return <h2>Loading...</h2>;
        }

        return (

            <div style={{ textAlign: "center", marginTop: "40px" }}>

                <h1>User Details</h1>

                <img
                    src={this.state.image}
                    alt="User"
                    width="180"
                    height="180"
                    style={{ borderRadius: "50%" }}
                />

                <h2>
                    {this.state.title} {this.state.firstName}
                </h2>

            </div>

        );

    }
}

export default Getuser;