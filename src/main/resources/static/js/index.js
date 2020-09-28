
function colorTitle() {
    $('#title').css('color', 'red'); 
    } 

    function toggleImage() {
        $('#pictureOfMyself').toggle(); 
    }

    function sendFizzBizz() {
        const number = $('#number').val();
        if(!number) {
            alert('Please enter a number first'); 
        } else {
            $.get('api/fizzbuzz/' + number, function (result) {
                $('#results').prepend('<p><b>' + number + '</b>: ' + result + '</p>');
            });
        }
    }

    function toggleNav() {
        var navigation = document.getElementById("item"); 
        var nav2 = document.getElementById("mySidebar"); 

        document.getElementById("menuItems").style.width = "250px";
        document.getElementById("mySidebar").style.marginLeft = "250px";

        // if (navigation.style.left == "0px") {
        //     navigation.style.width = '250px'; 
        //     nav2.style.marginLeft = "250px"
        // } else {
        //     navigation.style.width = "0px"
        //     nav2.style.marginLeft = "0px"; 
        // }
    }

    //     document.getElementById("mySidebar").style.width = "250px";
    //     document.getElementById("main").style.marginLeft = "250px";
    //   }
      
    //   function closeNav() {
    //     document.getElementById("mySidebar").style.width = "0";
    //     document.getElementById("main").style.marginLeft= "0";
    //   
