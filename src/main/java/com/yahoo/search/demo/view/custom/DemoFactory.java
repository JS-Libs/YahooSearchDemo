package com.yahoo.search.demo.view.custom;

import android.content.Context;
import android.content.Intent;

import com.yahoo.mobile.client.share.search.interfaces.IBrowser;
import com.yahoo.mobile.client.share.search.interfaces.IFactory;
import com.yahoo.mobile.client.share.search.interfaces.IImageLoader;
import com.yahoo.mobile.client.share.search.interfaces.IImageProcessor;
import com.yahoo.mobile.client.share.search.interfaces.IImageViewer;
import com.yahoo.mobile.client.share.search.interfaces.IInstrument;
import com.yahoo.mobile.client.share.search.interfaces.ILocalPreviewer;
import com.yahoo.mobile.client.share.search.interfaces.ILogger;
import com.yahoo.mobile.client.share.search.interfaces.INetworkAsync;
import com.yahoo.mobile.client.share.search.interfaces.IPartnerManager;
import com.yahoo.mobile.client.share.search.interfaces.IShare;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizer;
import com.yahoo.mobile.client.share.search.interfaces.IVoiceRecognizerListener;
import com.yahoo.mobile.client.share.search.ui.activity.SearchToLinkActivity;
import com.yahoo.mobile.client.share.yahoosearchlibraryexternalplugin.implementations.Browser;

/**
 * Created by mgujare on 9/23/15.
 */
public class DemoFactory implements IFactory {
    @Override
    public IBrowser getBrowser() {
        return new MyBrowser();
    }

    @Override
    public IBrowser getWebPreviewer() {
        return null;
    }

    @Override
    public IImageViewer getImagePreviewer() {
        return null;
    }

    @Override
    public IImageLoader getImageLoader(Context context) {
        return null;
    }

    @Override
    public IShare getShare() {
        return null;
    }

    @Override
    public IInstrument getInstrument() {
        return null;
    }

    @Override
    public INetworkAsync getNetwork(Context context) {
        return null;
    }

    @Override
    public ILogger getLogger() {
        return null;
    }

    @Override
    public IImageProcessor getImageProcessor() {
        return null;
    }

    @Override
    public IPartnerManager getPartnerManager() {
        return null;
    }

    @Override
    public ILocalPreviewer getLocalPreviewer() {
        return null;
    }

    @Override
    public IVoiceRecognizer createVoiceRecognizer(Context context, String s, IVoiceRecognizerListener iVoiceRecognizerListener) {
        return null;
    }

    public static class MyBrowser extends Browser {
        @Override
        public Intent getIntent(Context context, String url, String referral) {
            Intent previewIntent = new Intent(context, CustomWebPreviewActivity.class);
            previewIntent.putExtra(SearchToLinkActivity.SOURCE_URL, url);
            return previewIntent;
        }
    }
}
