package com.example.dealdoc.Models

data class ModelClassForGetAllDeal(
    val deal: List<DealData>,
    val message: String,
    val success: Boolean
)
data class User_(
    val appleID: String,
    val company: String,
    val createdAt: String,
    val email: String,
    val fullName: String,
    val id: Int,
    val password: Any,
    val phone_no: String,
    val profilePhoto: String,
    val resetToken: Any,
    val resetTokenExpiry: Any,
    val role_id: Int,
    val updatedAt: String
)
data class DealData(
    val closed_date: String,
    val color: Any,
    val createdAt: String,
    val deal_created_by: Int,
    val deal_name: String,
    val id: Int,
    val in_review: Boolean,
    val investment_size: Int,
    val is_draft: Boolean,
    val is_session_purchased: Boolean,
    val is_video_purchased: Boolean,
    val is_video_recommended: Any,
    val metadata: Any,
    val payement_Id: Any,
    val session_start_date: Any,
    val session_url: Any,
    val status: String,
    val updatedAt: String
)