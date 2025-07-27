import { useNavigate } from "react-router-dom";
import { useState } from "react";
import axios from "axios";
const AddBook =()=>{

        const [book,setBook]=useState({id:'',name:'',price:'',pubname:''});
        const navigate= useNavigate();

    const handleSubmit =async (e)=>{
        e.preventDefault();
        await axios.post("http://localhost:3001/books",book)
        navigate("/");
    };
    return(
        <div className="container">
            <h2>Add a Book</h2>
            <form onSubmit={handleSubmit}>
                <input type="text" placeholder="Enter Book ID" className="form-control" value={book.id} onChange={(e)=>setBook({...book,id:e.target.value})}/><br/>
                <input type="text" placeholder="Enter Book Name" className="form-control" value={book.name} onChange={(e)=>setBook({...book,name:e.target.value})}/><br/>
                <input type="text" placeholder="Enter Book Price" className="form-control" value={book.price} onChange={(e)=>setBook({...book,price:e.target.value})}/><br/>
                <input type="text" placeholder="Enter Book Publication" className="form-control" value={book.pubname} onChange={(e)=>setBook({...book,pubname:e.target.value})}/><br/>
                <button type="submit" className="btn btn-primary">Add</button>
            </form>
        </div>
    );
}
export default AddBook;