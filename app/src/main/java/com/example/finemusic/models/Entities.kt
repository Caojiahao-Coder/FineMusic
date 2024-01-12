package com.example.finemusic.models

data class LoginResultInfo(
    val userId: Int
)

data class LoginInfo(
    val Phone: String,
    val Password: String
)

data class UserInfo(
    val userId: Int,
    val nicename: String,
    val slogan: String,
    val phone: String,
    val photo: String
)

data class UpdateUserInfo(
    val Nicename: String,
    val Slogan: String
)

data class UpdateUserPhotoInfo(
    val Base64: String
)

data class UserIdInfo(
    val UserId: Int
)

data class MusicListInfo(
    val id: Int,
    val name: String,
    val creator: String,
    val cover: String,
    val createTime: String,
    val description: String,
    val musicCount: Int
)

data class MusicInfo(
    val id: Int,
    val name: String,
    val createTime: String,
    val description: String,
    val collectionId: Int,
    val collectionName: String,
    val singerId: Int,
    val singerName: String,
    val lrcFile: String,
    val hitCount: Int,
    val fileSrc: String
)

data class MusicListInfoByIdInfo(
    val isFollowed: Boolean
)

data class SearchResultInfo(
    val type: String,
    val id: Int,
    val name: String,
    val detail: MutableMap<String, String>
)

data class InputSearchInfo(
    val Value: String
)

data class NewMusicListInfo(
    val Name: String,
    val Base64: String,
    val Desc: String
)