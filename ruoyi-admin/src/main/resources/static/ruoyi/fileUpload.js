/**
 *
 * 文件上传封装
 * Copyright (c) 2019 ruoyi
 */

$(function () {

    $('.flatyUpload').each(function () {
        var $fileInput = $(this);
        // var $fileValInput = $fileInput.siblings().find("input[type='hidden']");
        var $fileValInput = $fileInput.siblings();
        var existFileUrls = $fileValInput.val();
        var fileArray = $.common.split(existFileUrls, ",");
        console.log("fileArray:", fileArray);
        var initialPreviewConfig = [];
        fileArray.forEach(function (o) {
            initialPreviewConfig.push({
                extra: {url: o}
            })
        })
        $fileInput.fileinput({
            'uploadUrl': 'http://lars.aylives.cn/Lars/upload',
            showClose: false,
            overwriteInitial: false,
            initialPreviewAsData: true,
            initialPreviewShowDelete: true,
            initialPreviewDownloadUrl: true,
            deleteUrl: "/tool/test",
            removeFromPreviewOnError: true,
            uploadAsync: true,
            autoOrientImage: false,
            validateInitialCount: true,
            initialPreview: existFileUrls,
            initialPreviewConfig: initialPreviewConfig

        }).on('fileuploaded', function (event, data, previewId, index) {
            console.log("fileuploaded:", data)
            var res = data.response;
            if (res.code == "200") {
                fileArray.push(res.data.url);
                $fileValInput.val(fileArray.join(","))
                $.modal.msgSuccess("上传成功");
            }
        }).on('filebeforedelete', function (event, key, data) {
            var existFileArray = []
            fileArray.forEach(function (o) {
                if (!o == data.url)
                    existFileArray.push(o)
            })
            fileArray = existFileArray;
            $fileValInput.val(existFileArray.join(","))

        });


    });


});