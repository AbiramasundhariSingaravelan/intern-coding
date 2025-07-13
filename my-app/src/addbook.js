import { useState } from "react";
import { useNavigate } from "react-router-dom";
function AddBook({onAdd}){
  const [id,setId]=useState('');
  const[name,setName]=useState('');
  const[price,setPrice]=useState('');
  const navigate = useNavigate(); 
  const handleSubmit=(e)=>{
    e.preventDefault();
    if(id && name && price)
    {
      onAdd({id,name,price});
      navigate('/');
    }

  };
return(
    <form onSubmit={handleSubmit} className="mb-4" >
    <div class="mb-3 mt-3">
      <label for="id">Book Id</label>
      <input type="text" class="form-control" id="bookid" 
      placeholder="Enter Book Id" name="bookid" value={id} onChange={e=>setId(e.target.value)}/>
    </div>
    <div class="mb-3">
      <label for="name">Book Name:</label>
      <input type="password" class="form-control" id="bookname" 
      placeholder="Enter Book Name" name="bookname" value={name} onChange={e=>setName(e.target.value)}/>
    </div>
    <div class="mb-3">
      <label for="name">Book Price:</label>
      <input type="password" class="form-control" id="price" 
      placeholder="Enter Book Price" name="price" value={price} onChange={e=>setPrice(e.target.value)}/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
)
}
export default AddBook;