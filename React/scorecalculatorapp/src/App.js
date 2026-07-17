import { CalculateScore } from "./Components/CalculateScore";

function App() {
    return (
        <div>
            <CalculateScore
                Name="Nohi"
                School="JNVK"
                total={284}
                goal={3}
            />
        </div>
    );
}

export default App;