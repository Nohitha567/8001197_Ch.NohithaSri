import React, { Component } from "react";

class CurrencyConverter extends Component {

    constructor() {
        super();

        this.state = {
            amount: "",
            euro: ""
        };
    }

    handleAmount = (e) => {
        this.setState({
            amount: e.target.value
        });
    };

    handleSubmit = (e) => {

        e.preventDefault();

        const euro = (this.state.amount / 90).toFixed(2);

        this.setState({
            euro: euro
        });

        alert(
            "Converting to Euro Amount is " + euro
        );
    };

    render() {

        return (

            <div>

                <h1 style={{ color: "green" }}>
                    Currency Converter!!!
                </h1>

                <form onSubmit={this.handleSubmit}>

                    <label>Amount</label>

                    <input
                        type="number"
                        value={this.state.amount}
                        onChange={this.handleAmount}
                    />

                    <br /><br />

                    <label>Currency</label>

                    <input
                        value="Euro"
                        readOnly
                    />

                    <br /><br />

                    <button type="submit">
                        Submit
                    </button>

                </form>

            </div>

        );
    }
}

export default CurrencyConverter;