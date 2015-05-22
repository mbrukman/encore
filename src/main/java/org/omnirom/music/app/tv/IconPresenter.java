package org.omnirom.music.app.tv;

import android.content.Context;
import android.support.v17.leanback.widget.Presenter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.omnirom.music.app.R;

public class IconPresenter extends Presenter {
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_icon_item, parent, false);
        v.setFocusable(true);
        v.setFocusableInTouchMode(true);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, Object item) {
        if (item instanceof SettingsItem) {
            Context ctx = viewHolder.view.getContext();
            int icon;
            String label;

            switch (((SettingsItem) item).getType()) {
                case SettingsItem.ITEM_EFFECTS:
                    icon = R.drawable.ic_tv_effects;
                    label = ctx.getString(R.string.settings_dsp_config_title);
                    break;

                case SettingsItem.ITEM_PROVIDERS:
                    icon = R.drawable.ic_tv_providers;
                    label = ctx.getString(R.string.settings_provider_config_title);
                    break;

                case SettingsItem.ITEM_LICENSES:
                    icon = R.drawable.ic_tv_info;
                    label = ctx.getString(R.string.settings_licenses_title);
                    break;

                default:
                    icon = R.drawable.ic_tv_info;
                    label = "Unknown entry";
                    break;
            }

            ((TextView) viewHolder.view.findViewById(R.id.tvLabel)).setText(label);
            ((ImageView) viewHolder.view.findViewById(R.id.ivIcon)).setImageResource(icon);
        }
    }

    @Override
    public void onUnbindViewHolder(ViewHolder viewHolder) {

    }
}
