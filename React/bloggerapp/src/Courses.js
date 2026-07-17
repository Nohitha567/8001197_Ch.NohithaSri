import { courses } from "./Data";

function Courses() {

  return (

    <div>

      <h2>Course Details</h2>

      {courses.map(course => (

        <div key={course.id}>

          <h3>{course.cname}</h3>

          <h4>{course.date}</h4>

        </div>

      ))}

    </div>

  );

}

export default Courses;