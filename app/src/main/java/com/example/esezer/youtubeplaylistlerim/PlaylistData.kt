package com.example.esezer.youtubeplaylistlerim

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PlaylistData {

    @Expose
    @SerializedName("items")
    var items: List<Items>? = null
    @Expose
    @SerializedName("pageInfo")
    var pageInfo: PageInfo? = null
    @Expose
    @SerializedName("etag")
    var etag: String? = null
    @Expose
    @SerializedName("kind")
    var kind: String? = null

    class Items {
        @Expose
        @SerializedName("snippet")
        var snippet: Snippet? = null
        @Expose
        @SerializedName("id")
        var id: String? = null
        @Expose
        @SerializedName("etag")
        var etag: String? = null
        @Expose
        @SerializedName("kind")
        var kind: String? = null
    }

    class Snippet {
        @Expose
        @SerializedName("localized")
        var localized: Localized? = null
        @Expose
        @SerializedName("channelTitle")
        var channelTitle: String? = null
        @Expose
        @SerializedName("thumbnails")
        var thumbnails: Thumbnails? = null
        @Expose
        @SerializedName("description")
        var description: String? = null
        @Expose
        @SerializedName("title")
        var title: String? = null
        @Expose
        @SerializedName("channelId")
        var channelId: String? = null
        @Expose
        @SerializedName("publishedAt")
        var publishedAt: String? = null
    }

    class Localized {
        @Expose
        @SerializedName("description")
        var description: String? = null
        @Expose
        @SerializedName("title")
        var title: String? = null
    }

    class Thumbnails {
        @Expose
        @SerializedName("standard")
        var standard: Standard? = null
        @Expose
        @SerializedName("medium")
        var medium: Medium? = null
    }

    class Standard {
        @Expose
        @SerializedName("height")
        var height: Int = 0
        @Expose
        @SerializedName("width")
        var width: Int = 0
        @Expose
        @SerializedName("url")
        var url: String? = null
    }

    class Medium {
        @Expose
        @SerializedName("height")
        var height: Int = 0
        @Expose
        @SerializedName("width")
        var width: Int = 0
        @Expose
        @SerializedName("url")
        var url: String? = null
    }

    class PageInfo {
        @Expose
        @SerializedName("resultsPerPage")
        var resultsPerPage: Int = 0
        @Expose
        @SerializedName("totalResults")
        var totalResults: Int = 0
    }
}
