document.addEventListener('DOMContentLoaded', init, false);

let data, table, sortCol;
let sortAsc = false;
const pageSize = 1;
let curPage = 1;

async function init() {
  
  // Select the table (well, tbody)
  table = document.querySelector('#myTable tbody');
  // get the cats
    let resp = await fetch(document.addEventListener('DOMContentLoaded', init, false);

    let data, table, sortCol;
    let sortAsc = false;
    const pageSize = 3;
    let curPage = 1;
    
    async function init() {
      
      // Select the table (well, tbody)
      table = document.querySelector('#myTable');
      // get the cats
      let resp = await fetch('https://www.raymondcamden.com/.netlify/functions/get-cats');
      data = await resp.json();
      renderTable();
      
      
      
      document.querySelector('#nextButton').addEventListener('click', nextPage, false);
      document.querySelector('#prevButton').addEventListener('click', previousPage, false);
    }
    
    function renderTable() {
      // create html
      let result = '';
      data.filter((row, index) => {
            let start = (curPage-1)*pageSize;
            let end =curPage*pageSize;
            if(index >= start && index < end) return true;
      }).forEach(c => {
         result += `<tr>
         <td>${c.topicname}</td>
         
         </tr>`;
      });
      table.innerHTML = result;
    }
    

    
    function previousPage() {
      if(curPage > 1) curPage--;
      renderTable();
    }
    
    function nextPage() {
      if((curPage * pageSize) < data.length) curPage++;
      renderTable();
    });
  data = await resp.json();
  renderTable();
  document.querySelector('#nextButton').addEventListener('click', nextPage, false);
  document.querySelector('#prevButton').addEventListener('click', previousPage, false);
}

function renderTable() {
  // create html
  let result = '';
  data.filter((row, index) => {
        let start = (curPage-1)*pageSize;
        let end =curPage*pageSize;
        if(index >= start && index < end) return true;
  }).forEach(c => {
     result += `<tr>
     <td>${c.topicname}</td>
     </tr>`;
  });
  table.innerHTML = result;
}



function previousPage() {
  if(curPage > 1) curPage--;
  renderTable();
}

function nextPage() {
  if((curPage * pageSize) < data.length) curPage++;
  renderTable();
}