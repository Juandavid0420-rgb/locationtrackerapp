package com.example.location


import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.GoTrue
import io.github.jan.supabase.storage.Storage

object SupabaseClient {
    val client: SupabaseClient = createSupabaseClient(
        supabaseUrl = "https://qusqceorlynadscrqqqc.supabase.co",
        supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InF1c3FjZW9ybHluYWRzY3JxcXFjIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NDc1OTc0MTAsImV4cCI6MjA2MzE3MzQxMH0.EuDQVUibvVhrxgwnGkqTU_j4NLUOXiHzzcBd2MLBiTQ"
    ) {
        install(GoTrue)
        install(Storage)
    }
}