<html>
<body>
<h2>Hello World!</h2>
<a href="hello?id=1">click me</a>
<a href="javascript:void(0);" onclick="send()">use  api</a>
<%--<a href="javascript:void(0);" onclick="exportTest()">下载excel</a>--%>
<hr><h1>ajax  upload  file</h1><hr>
<p>please upload your  file here:<input id="file_upload" type="file" name="testfile"></p>
<button id="jquery_post">jquery submit</button>
</body>


<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script>
    $(function () {


        var url = 'http://localhost:8088/export';
        var xhr = new XMLHttpRequest();
        xhr.open('POST', url, true); // 也可以使用POST方式，根据接口
        xhr.responseType = 'blob'; // 返回类型blob
        xhr.onload = function () {
            if (this.status === 200) {
                var blob = this.response;
                const url = window.URL.createObjectURL(blob);
                const a = document.createElement('a');
                a.style.display = 'none';
                a.href = url;
                a.download = 'xxx.xlsx';
                document.body.appendChild(a);
                a.click();
                window.URL.revokeObjectURL(url);
            }
        };
// 发送ajax请求
        xhr.send();
    })

    function send(){
        $.ajax({
            type: "POST",
            url: "http://localhost:8088/user/1",
            data: "",
            cache: false,
            contentType: false,
            processData: false,
            dataType: 'json',
            // xhrFields: {
            //     withCredentials: false
            // },
            beforeSend: function (XMLHttpRequest) {
                XMLHttpRequest.setRequestHeader("Authorization", "Bearer eyJhbGciOiJIUzUxMiJ9.eyJleHAiOjE2NTA3ODk0NzgsInV1aWQiOiJjNjI5NWRhMzhjOTQ0NDYwYTBhMmJkZDdjNjE2Y2RmZiJ9.uBAycMbrF0TiP8qlOdfxSkLqKjiQ_-unJhPgiPWpEUhxahNFQ3_5IdtXAKd2UwsxQZOM0Mev2V5DOA72MsymDw");
            },
            success: function(result) {
                if (result.code === 200) {
                    console.log(result.msg);
                    alert("username:"+result.data.username+"\n"+"phone:"+result.data.phone);
                    // //新打开一个页面（about:blank是打开浏览器空白页的命令）, _blank：打开一个新的窗口
                    // var newPage = window.open("about:blank", "_blank");
                    // //将后台传过来的html页面写到新打开的浏览器窗口中显示
                    // obj.document.write(result.data);

                }
            },
            error: function(error) {
                console.log(error)
            }
        });
    }


    $("#jquery_post").on("click",function(){
        var data=new FormData;
        data.append("file",document.getElementById("file_upload").files[0]);
        $.ajax({
            url:"http://localhost:8088/importUser",
            type:"POST",
            dataType:"JSON",
            data:data,
            contentType: false,
            processData: false,
            success:function(rst){
                alert(rst.data)
            }
        })
    })


</script>

</html>
