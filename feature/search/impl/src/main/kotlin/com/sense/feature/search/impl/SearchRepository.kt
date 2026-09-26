package com.sense.feature.search.impl

import javax.inject.Inject

interface SearchRepository {
    suspend fun search(query: String): List<String>
}

class FakeSearchRepository @Inject constructor() : SearchRepository {
    private val items = listOf("Home", "Search", "Settings", "Sense Help")

    override suspend fun search(query: String): List<String> {
        if (query.isBlank()) return emptyList()
        return items.filter { it.contains(query.trim(), ignoreCase = true) }
    }
}

/*
Core Banking Features
    Account balance - View balances for savings, current, salary, and joint accounts.
    Transaction history - Filterable list of recent and past transactions.
    Money transfer - Send money via bank transfer, UPI, Faster Payments, or internal transfers.
    Add beneficiary - Manage saved payees for quick transfers.
    Scheduled payments - Standing orders, recurring transfers, auto‑pay setups.
    Upcoming payments - Bills, EMIs, subscriptions, direct debits due soon.
    Bill payments - Electricity, water, broadband, credit card bills, etc.
    Card management - Freeze/unfreeze card, change PIN, set limits, replace card.

Security & Profile
    Login & authentication - Biometrics, passcodes, device binding.
    Notifications - Alerts for transactions, low balance, suspicious activity.
    KYC update - Document upload, verification status.
    Profile settings - Personal details, communication preferences.

Cards & Payments
    Credit card dashboard - Outstanding amount, statement, rewards.
    Credit card payment - Pay dues, set auto‑pay.
    Rewards & cashback - Points, redemption, offers.

Savings & Investments
    Fixed deposits - Create, break, renew FD.
    Recurring deposits - Monthly savings plans.
    Mutual funds - SIP, lumpsum, portfolio view.
    Goal-based savings - Buckets for travel, emergency fund, etc.

Statements & Documents
    Download statements - Monthly, quarterly, yearly.
    Tax documents - Form 16A, interest certificates.

Support & Utility
    ATM locator - Nearby ATMs and branches.
    Customer support - Chat, call, FAQs.
    Service requests - Chequebook request, dispute transaction, update address.

*/