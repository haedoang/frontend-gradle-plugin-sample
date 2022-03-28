import React, { useState, useEffect} from 'react';
import './App.css';

function App() {
  const [isLoading, setLoading] = useState(true);
  const [error, setError] = useState();
  const [data, setData] = useState();

  useEffect(() => {
    fetch('api/v1/users')
      .then(response => response.json())
      .then(users => {
        console.log(users);
        setLoading(false);
        setData(users);
      })
      .catch(error => {
        console.error('Error:', error);
        setLoading(false);
        setError('Fetch Error');
      });

  }, []);

  if (isLoading) return <div>loading...</div>
  else if (error) return <div>{error}</div>
  else return <div>fetch data : {JSON.stringify(data)}</div>
}

export default App;
