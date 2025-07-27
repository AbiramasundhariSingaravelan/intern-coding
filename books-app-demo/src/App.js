import logo from './logo.svg';
import './App.css';
import { Route } from 'react-router-dom';
import { Routes } from 'react-router-dom';
import BookList from './components/booklist';
import AddBook from './components/addbook';
import UpdateBook from './components/updatebook';

function App() {
  return (
    <Routes>
      <Route path="/" element={<BookList/>}/>
      <Route path="/add" element={<AddBook/>}/>
      <Route path="/update/:id" element={<UpdateBook/>}/>
      
    </Routes>
  );
}

export default App;
