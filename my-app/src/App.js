import './App.css';
import BookList from './booklist';
import AddBook from './addbook';
import { useState } from 'react';
import { useNavigate, Routes, Route } from 'react-router-dom';

function App() {
  const navigate = useNavigate();
  const [books,setBooks]=useState([]);
  const addBook=(book)=>{
setBooks([...books, book]); // Use user-input ID directly
  }
  return (
    <>
      <nav className="navbar navbar-expand-sm bg-dark navbar-dark">
        <div className="container-fluid">
          <ul className="navbar-nav">
            <li className="nav-item">
              <span className="nav-link">Book Management System</span>
            </li>
          </ul>
        </div>
      </nav>

      <div className="container mt-3">
        <button onClick={() => navigate('/addbook')} className="btn btn-primary mb-3">
          Add Books
        </button>
        <Routes>
          <Route path="/" element={<BookList books={books}/>} />
          <Route path="/addbook" element={<AddBook onAdd={addBook} />} />
        </Routes>
      </div>
    </>
  );
}

export default App;
