import React, { Component } from "react";

class Register extends Component {

    constructor() {
        super();

        this.state = {
            fullName: "",
            email: "",
            password: "",
            errors: {}
        };
    }

    handleChange = (event) => {

        const { name, value } = event.target;

        this.setState({
            [name]: value
        });

    };

    validateForm = () => {

        let errors = {};

        if (this.state.fullName.length < 5) {
            errors.fullName = "Full Name must be at least 5 characters long";
        }

        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!emailRegex.test(this.state.email)) {
            errors.email = "Email is not valid";
        }

        if (this.state.password.length < 8) {
            errors.password = "Password must be at least 8 characters long";
        }

        this.setState({ errors });

        return Object.keys(errors).length === 0;
    };

    handleSubmit = (event) => {

        event.preventDefault();

        if (this.validateForm()) {

            alert("Valid Form");

        } else {

            if (this.state.errors.fullName)
                alert(this.state.errors.fullName);

            if (this.state.errors.email)
                alert(this.state.errors.email);

            if (this.state.errors.password)
                alert(this.state.errors.password);
        }

    };

    render() {

        return (

            <div style={{ margin: "40px" }}>

                <h1 style={{ color: "red" }}>
                    Register Here!!!
                </h1>

                <form onSubmit={this.handleSubmit}>

                    <table>

                        <tbody>

                            <tr>
                                <td>Name:</td>

                                <td>
                                    <input
                                        type="text"
                                        name="fullName"
                                        value={this.state.fullName}
                                        onChange={this.handleChange}
                                    />
                                </td>
                            </tr>

                            <tr>
                                <td>Email:</td>

                                <td>
                                    <input
                                        type="text"
                                        name="email"
                                        value={this.state.email}
                                        onChange={this.handleChange}
                                    />
                                </td>
                            </tr>

                            <tr>
                                <td>Password:</td>

                                <td>
                                    <input
                                        type="password"
                                        name="password"
                                        value={this.state.password}
                                        onChange={this.handleChange}
                                    />
                                </td>
                            </tr>

                            <tr>
                                <td></td>

                                <td>
                                    <button type="submit">
                                        Submit
                                    </button>
                                </td>
                            </tr>

                        </tbody>

                    </table>

                </form>

            </div>

        );

    }

}

export default Register;