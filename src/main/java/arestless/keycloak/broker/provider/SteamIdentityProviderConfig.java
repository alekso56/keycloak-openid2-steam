package arestless.keycloak.broker.provider;

import org.keycloak.models.IdentityProviderModel;

public class SteamIdentityProviderConfig extends IdentityProviderModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 6970732439517831964L;

	public SteamIdentityProviderConfig(IdentityProviderModel model) {
        super(model);
    }

    public SteamIdentityProviderConfig() {
	}

	public String getSteamApiKey() {
        return getConfig().get("steamApiKey");
    }

    public void setSteamApiKey(String key) {
        getConfig().put("steamApiKey", key);
    }
}