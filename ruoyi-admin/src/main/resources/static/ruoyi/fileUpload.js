/**
 *
 * 文件上传封装
 * Copyright (c) 2019 ruoyi
 */

$(function() {

    console.log("flatyUpload")
    var $fileInput = $('.flatyUpload');
    // var $fileValInput = $fileInput.siblings().find("input[type='hidden']");
    var $fileValInput = $fileInput.siblings();
    console.log("$fileValInput:",$fileValInput.html());
    var existFileUrls = $fileValInput.val();
    var fileArray = $.common.split(existFileUrls, ",");
    console.log("fileArray:",fileArray);
    var initialPreviewConfig = [];
    fileArray.forEach(function (o) {
        initialPreviewConfig.push({
            extra:{url:o}
        })
    })
    $fileInput.fileinput({
        'uploadUrl': 'http://lars.aylives.cn/Lars/upload',
        showClose:false,
        initialPreviewShowDelete:true,
        initialPreviewDownloadUrl:true,
        deleteUrl:"/login",
        removeFromPreviewOnError:true,
        maxFileCount:5,
        uploadAsync:false,
        initialPreview: existFileUrls,
        initialPreviewConfig:initialPreviewConfig

    }).on('fileuploaded', function(event, data, previewId, index) {
        console.log("fileuploaded:",data)
        var res = data.response;
    }).on('filebeforedelete', function(event, key, data) {
        console.log("fileuploaded:",event.target)
        console.log("key:",key)
        console.log("data:",data)
    });

});