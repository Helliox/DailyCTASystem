window.onload = function () {
    let todayBgElement = document.getElementById("bg");
    let tomorrowBgElement = document.getElementById("nextBg");
    changeTodayBg(todayBgElement);
    changeTomorrowBg(tomorrowBgElement)
    setInterval(function() {
        changeTodayBg(todayBgElement)
        changeTomorrowBg(tomorrowBgElement)
    },6000)
};

function changeTodayBg(todayBgElement)
{
    let request = new XMLHttpRequest();

    request.open("GET","/getBg")
    request.onreadystatechange = function () {
        if(this.readyState === 4 && this.status === 200)
        {
            changeBackground(request.response,document.getElementById("wrapper"))
            todayBgElement.innerText = request.response;
        }
    };
    request.send()
}
function changeTomorrowBg(tomorrowBgElement)
{
    let request = new XMLHttpRequest();

    request.open("GET","/getNextBg")
    request.onreadystatechange = function () {
        if(this.readyState === 4 && this.status === 200)
        {
            changeBackground(request.response,document.getElementById("bottomText"))
            tomorrowBgElement.innerText = request.response;
        }
    };
    request.send()
}


function changeBackground(bg,element)
{
    switch(bg)
    {
        case "Warsong Gulch":
            element.style.backgroundImage = "url('images/wsg.png')";
            break;
        case "Arathi Basin":
            element.style.backgroundImage = "url('images/ab.jpg')";
            break;
        case "Eye of the Storm":
            element.style.backgroundImage = "url('images/eots.jpg')";
            break;
        case "Strand of the Ancients":
            element.style.backgroundImage = "url('images/sota.jpg')";
            break;
        case "Isle of Conquest":
            element.style.backgroundImage = "url('images/ioc.jpg')";
            break;
        case "Alterac Valley":
            element.style.backgroundImage = "url('images/av.png')";
            break;
    }
}