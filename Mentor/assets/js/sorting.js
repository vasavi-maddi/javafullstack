let data, table, sortCol;
let sortAsc = false;

async function init() {
  
    // Select the table (well, tbody)
    table = document.querySelector('#myTable');
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
        let resp = await fetch(document.getElementById('#mytable'));
        data = await resp.json();
        renderTable();
        }
document.querySelectorAll('#myTable thead tr th').forEach(t => {
	t.addEventListener('click', sort, false);
});
document.querySelectorAll('#myTable thead tr th').forEach(t => {
	t.addEventListener('click', sort, false);
});
function renderTable() {
    // create html
    let result = '';
    data.forEach(c => {
       result += `<tr>
       <td>${c.topicname}</td>
       </tr>`;
    });
    table.innerHTML = result;
  }
  function sort(e) {
    let thisSort = e.target.dataset.sort;
    if(sortCol === thisSort) sortAsc = !sortAsc;
    sortCol = thisSort;
    data.sort((a, b) => {
      if(a[sortCol] < b[sortCol]) return sortAsc?1:-1;
      if(a[sortCol] > b[sortCol]) return sortAsc?-1:1;
      return 0;
    });
    renderTable();
  }