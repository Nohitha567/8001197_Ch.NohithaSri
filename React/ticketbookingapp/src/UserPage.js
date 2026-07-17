import React from "react";

function UserPage() {

    return (

        <div>

            <h2>Welcome User</h2>

            <h3>Book Your Flight</h3>

            <form>

                <label>Name:</label>

                <input type="text" />

                <br /><br />

                <label>Flight:</label>

                <select>
                    <option>AI101</option>
                    <option>AI202</option>
                    <option>AI303</option>
                </select>

                <br /><br />

                <button>Book Ticket</button>

            </form>

        </div>

    );

}

export default UserPage;