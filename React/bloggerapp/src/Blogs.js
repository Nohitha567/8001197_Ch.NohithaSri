import { blogs } from "./Data";

function Blogs() {

  return (

    <div>

      <h2>Blog Details</h2>

      {blogs.map(blog => (

        <div key={blog.id}>

          <h3>{blog.title}</h3>

          <h4>{blog.author}</h4>

          <p>{blog.description}</p>

        </div>

      ))}

    </div>

  );

}

export default Blogs;