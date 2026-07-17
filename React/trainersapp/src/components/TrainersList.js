import { Link } from "react-router-dom";
import TrainersMock from "../TrainersMock";

function TrainersList() {

    return (

        <div>

            <h2>Trainer List</h2>

            <ul>

                {TrainersMock.map(trainer => (

                    <li key={trainer.id}>

                        <Link to={`/trainers/${trainer.id}`}>
                            {trainer.name}
                        </Link>

                    </li>

                ))}

            </ul>

        </div>

    );

}

export default TrainersList;