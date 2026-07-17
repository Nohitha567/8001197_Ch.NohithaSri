import React, { Component } from "react";
import Cart from "./Cart";

class OnlineShopping extends Component {

    items = [
        { Itemname: "Laptop", Price: 60000 },
        { Itemname: "Mobile", Price: 25000 },
        { Itemname: "Headphones", Price: 3000 },
        { Itemname: "Keyboard", Price: 1500 },
        { Itemname: "Mouse", Price: 800 }
    ];

    render() {
        return (
            <div>

                <h2>Online Shopping Cart</h2>

                <table border="1" cellPadding="8">

                    <thead>
                        <tr>
                            <th>Item Name</th>
                            <th>Price</th>
                        </tr>
                    </thead>

                    <tbody>
                        {this.items.map((item, index) => (
                            <Cart
                                key={index}
                                Itemname={item.Itemname}
                                Price={item.Price}
                            />
                        ))}
                    </tbody>

                </table>

            </div>
        );
    }
}

export default OnlineShopping;