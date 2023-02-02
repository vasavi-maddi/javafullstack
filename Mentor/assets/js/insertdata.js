function insertdata(){
    let sorting=false;
var myarray=[
    {'Topicname':'java','Startdate':'1/1/2023','Enddate':'15/1/2023','Duration':60},
    {'Topicname':'R programming','Startdate':'1/1/2023','Enddate':'2/1/2023','Duration':50},
    {'Topicname':'css','Startdate':'14/1/2023','Enddate':'1/1/2023','Duration':30},
    {'Topicname':'html','Startdate':'14/1/2023','Enddate':'11/12/2023','Duration':40},
    {'Topicname':'javascript','Startdate':'15/1/2023','Enddate':'15/2/2023','Duration':10}];

window.onload=()=>{
    build_table(myarray)
}

build_table(myarray)
function build_table(myarray){
var table=document.getElementById('tableinsert');
var datahtml='';
for(let data of myarray)
    {
        datahtml += `<tr><td>${data.Topicname}</td><td>${data.Startdate}</td><td>${data.Enddate}</td><td>${data.Duration}</td></tr>`;
    }
    console.log(datahtml)
    table.innerHTML=datahtml;
}
}