
$(document).ready(function(){
    const $ul = $("#content-wrap tbody");
    // $("#content-wrap tbody").html("hello");
    let text = "";
    qnas.forEach(qna => {
        console.log(qna);
        text += `
                    <a href="javascript:void(0)">
                    
                        <tr>
                            <td class="checkbox-line"><input type="checkbox" name="check"></td>
                            <td class="noticeId">${qna.qnaId}</td>
                            <td>
                                <a href="">${qna.qnaTitle}</a>
                            </td>
                            <td>${qna.userName}</td>
                            <td>${qna.qnaRegisterDateTime}</td>
                         </tr>
        `
        // questions.files.forEach(file => {
        //     if(file.fileType == "REPRESENTATIVE"){
        //         text += `<img src="/files/display?fileName=${file.filePath}/t_${file.fileUuid}_${file.fileName}" class="preview">`;
        //     }
        // })

        text += `
                    </a>
            
        `
    });
    console.log(text);
    $ul.html(text);
});

// <tr th:each="qna:${qnas}">
//     <td th:text="안녕하세요?"></td>
//     <td th:text="${qna.qnaTitle}"></td>
//     <td th:text="${qna.qnaRegisterDateTime}"></td>
//     <td th:text="${qna.userName}"></td>
//
//     </tr>
