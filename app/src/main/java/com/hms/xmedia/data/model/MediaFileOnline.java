/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.hms.xmedia.data.model;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.Text;
import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.annotations.EntireEncrypted;
import com.huawei.agconnect.cloud.database.annotations.NotNull;
import com.huawei.agconnect.cloud.database.annotations.Indexes;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;

import java.util.Date;

/**
 * Definition of ObjectType MediaFileOnline.
 *
 * @since 2022-06-02
 */
@PrimaryKeys({"mediaId"})
public final class MediaFileOnline extends CloudDBZoneObject {
    private String mediaId;

    private String mediaType;

    private String mediaURI;

    private String userId;

    private String title;

    private String fileExtension;

    private String fileNameWithoutExtension;

    private String fileAddedDate;

    private String fileSize;

    private String cloudFileFullName;

    private String duration;

    private String artist;

    public MediaFileOnline() {
        super(MediaFileOnline.class);
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaURI(String mediaURI) {
        this.mediaURI = mediaURI;
    }

    public String getMediaURI() {
        return mediaURI;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return userId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileNameWithoutExtension(String fileNameWithoutExtension) {
        this.fileNameWithoutExtension = fileNameWithoutExtension;
    }

    public String getFileNameWithoutExtension() {
        return fileNameWithoutExtension;
    }

    public void setFileAddedDate(String fileAddedDate) {
        this.fileAddedDate = fileAddedDate;
    }

    public String getFileAddedDate() {
        return fileAddedDate;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setCloudFileFullName(String cloudFileFullName) {
        this.cloudFileFullName = cloudFileFullName;
    }

    public String getCloudFileFullName() {
        return cloudFileFullName;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDuration() {
        return duration;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

}