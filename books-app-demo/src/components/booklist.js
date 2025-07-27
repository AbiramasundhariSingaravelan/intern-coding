import { useEffect } from "react";
import { useState } from "react";
import { Link } from "react-router-dom";
import axios from "axios";
const BookList =()=>{

    const[books,setBooks]=useState([]);

    const getBooks=async()=>{
        const res= await axios.get("http://localhost:3001/books")
        setBooks(res.data);
    }
    const deleteBook=async(id)=>{
        await axios.delete(`http://localhost:3001/books/${id}`)
        alert('Record dEleted')
    }
    //side effect operaation
    //one of the react hooks
    useEffect(()=>{
        getBooks();
    }, []);

    return(
        <div className="container">
            <h2>Book List</h2>
            <Link to="/add">Add Book</Link>
            <table class="table">
                <thead>
                    <th>Id</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Publication</th>
                    <th>Action</th>
            
                </thead>
                <tbody>
          {books.map((book) => (
            <tr key={book.id}>
              <td>{book.id}</td>
              <td>{book.name}</td>
              <td>{book.price}</td>
              <td>{book.pubname}</td>
              <td>
               <Link to={`/update/${book.id}`}>Update</Link>
              </td>
              <td>
                <button  onClick={()=>deleteBook(book.id)}  className="btn btn-primary">Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
            </table>
        </div>
    )
}
export default BookList;