package com.myapps.testbtsid

import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @POST("login")
    fun getRequestToken (
        @Path("login") password: String, username: String
    )

    @POST("register")
    fun postRegister(
        @Path("register") email: String, password: String, username: String
    )

    //
    @GET("checklist")
    fun getAllChecklist(
        @Path("checklistId") checklistId: Int
    )


    @POST("checklist/{checklistId}/item")
    fun postNewChecklist(
        @Path("checklistId") checklistId: Int
    )

    @DELETE("checklist/{checklistId}/item")
    fun deleteChecklistbyId(
        @Path("checklistId") checklistId: Int
    )

//
    @GET("checklist/{checklistId}/item")
    fun getAllItemChecklistId(
        @Path("checklistId") checklistId:Int
    )

    @POST("checklist/{checklistId}/item")
    fun createNewItem(
        @Path("checklistId") checklistId:Int
    )

    @GET("checklist/{checklistId}/item/{checklistItemId}")
    fun getChecklistbyChecklistId(
        @Path("checklistId") checklistId:Int
    )

    @PUT("checklist/{checklistId}/item/{checklistItemId}")
    fun updateItem(
        @Path("checklistId") checklistId: Int
    )

    @DELETE("checklist/{checklistId}/item/{checklistItemId}")
    fun deleteItembyitemid(
        @Path("checklistId") checklistId: Int
    )

    @PUT("checklist/{checklistId}/item/rename/{checklistItemId}")
    fun renameItem(
        @Path("checklistId") checklistId: Int
    )

}