import react from "react";
import 'bootstrap/dist/css/bootstrap.min.css';
import { Link } from "react-router-dom";
function BookList({books=[]})
{
    
    return(
        <>
            <div class="container">
                <h2>Book Details</h2>
                {books.length===0 ? (<p>No Books available.</p>):(
                  <table class="table">
                    <tr>
                        <th>Book Id</th>
                        <th>Book Name</th>
                        <th>Book Price</th>
                        <th>Update Book</th>
                        <th>Delete Book</th>
                    </tr>
                    {books.map(book=>(
                        <tr key={book.id}>
                           <td>{book.id}</td> 
                           <td>{book.name}</td> 
                           <td>{book.price}</td> 
                           <td><Link to={`/edit/${book.id}`}>Edit</Link></td>
                           <td><button >Delete</button></td>
                        </tr>
                    ))}
                  </table>  
                )}
            </div>
        </>
    );
}
export default BookList;