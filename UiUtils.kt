class UiUtils{

//need to add app_market_link & app_google_play_store_link in string resource
 fun openPlayStoreForApp(context: Context) {
        val appPackageName = context.getPackageName()
        try {
            context.startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .resources
                            .getString(R.string.app_market_link) + appPackageName)))
        } catch (e: android.content.ActivityNotFoundException) {
            context.startActivity(Intent(Intent.ACTION_VIEW,
                    Uri.parse(context
                            .resources
                            .getString(R.string.app_google_play_store_link) + appPackageName)))
        }

    }
    
}
