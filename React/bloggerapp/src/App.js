import "./App.css";
import Books from "./Books";
import Blogs from "./Blogs";
import Courses from "./Courses";

function App() {

  const showBooks = true;
  const showBlogs = true;
  const showCourses = true;

  return (

    <div className="container">

      {showCourses && (
        <div className="card">
          <Courses />
        </div>
      )}

      {showBooks ? (
        <div className="card">
          <Books />
        </div>
      ) : null}

      {showBlogs ? (
        <div className="card">
          <Blogs />
        </div>
      ) : (
        <h2>No Blogs Available</h2>
      )}

    </div>

  );

}

export default App;