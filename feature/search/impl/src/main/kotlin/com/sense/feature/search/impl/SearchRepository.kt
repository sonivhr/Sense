package com.sense.feature.search.impl

import javax.inject.Inject

interface SearchRepository {
    suspend fun search(query: String): List<Feature>
}

class FakeSearchRepository @Inject constructor() : SearchRepository {

    override suspend fun search(query: String): List<Feature> {
        if (query.isBlank()) return emptyList()
        return features
            .filter { feature ->
                feature.title.contains(query.trim(), ignoreCase = true)
            }
    }

    private val features = listOf(
        Feature(
            category = "Core Banking Features",
            title = "Account balance",
            description = "View balances for savings, current, salary, and joint accounts."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Transaction history",
            description = "Filterable list of recent and past transactions."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Money transfer",
            description = "Send money via bank transfer, UPI, Faster Payments, or internal transfers."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Add beneficiary",
            description = "Manage saved payees for quick transfers."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Scheduled payments",
            description = "Standing orders, recurring transfers, auto‑pay setups."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Upcoming payments",
            description = "Bills, EMIs, subscriptions, direct debits due soon."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Bill payments",
            description = "Electricity, water, broadband, credit card bills, etc."
        ),
        Feature(
            category = "Core Banking Features",
            title = "Card management",
            description = "Freeze/unfreeze card, change PIN, set limits, replace card."
        ),
        Feature(
            category = "Security & Profile",
            title = "Login & authentication",
            description = "Biometrics, passcodes, device binding."
        ),
        Feature(
            category = "Security & Profile",
            title = "Notifications",
            description = "Alerts for transactions, low balance, suspicious activity."
        ),
        Feature(
            category = "Security & Profile",
            title = "KYC update",
            description = "Document upload, verification status."
        ),
        Feature(
            category = "Security & Profile",
            title = "Profile settings",
            description = "Personal details, communication preferences."
        ),
        Feature(
            category = "Cards & Payments",
            title = "Credit card dashboard",
            description = "Outstanding amount, statement, rewards."
        ),
        Feature(
            category = "Cards & Payments",
            title = "Credit card payment",
            description = "Pay dues, set auto‑pay."
        ),
        Feature(
            category = "Cards & Payments",
            title = "Rewards & cashback",
            description = "Points, redemption, offers."
        ),
        Feature(
            category = "Savings & Investments",
            title = "Fixed deposits",
            description = "Create, break, renew FD."
        ),
        Feature(
            category = "Savings & Investments",
            title = "Recurring deposits",
            description = "Monthly savings plans."
        ),
        Feature(
            category = "Savings & Investments",
            title = "Mutual funds",
            description = "SIP, lumpsum, portfolio view."
        ),
        Feature(
            category = "Savings & Investments",
            title = "Goal-based savings",
            description = "Buckets for travel, emergency fund, etc."
        ),
        Feature(
            category = "Statements & Documents",
            title = "Download statements",
            description = "Monthly, quarterly, yearly."
        ),
        Feature(
            category = "Statements & Documents",
            title = "Tax documents",
            description = "Form 16A, interest certificates."
        ),
        Feature(
            category = "Support & Utility",
            title = "ATM locator",
            description = "Nearby ATMs and branches."
        ),
        Feature(
            category = "Support & Utility",
            title = "Customer support",
            description = "Chat, call, FAQs."
        ),
        Feature(
            category = "Support & Utility",
            title = "Service requests",
            description = "Chequebook request, dispute transaction, update address."
        ),
    )
}

data class Feature(
    val category: String,
    val title: String,
    val description: String,
)
