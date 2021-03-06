/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2016-01-08 17:48:37 UTC)
 * on 2016-01-27 at 05:33:59 UTC 
 * Modify at your own risk.
 */

package com.appspot.around_my.around.data.around;

/**
 * Service definition for Around (v1.0.4).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link AroundRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class Around extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.18.0-rc of the around library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://around-my.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "around/v1.0.4/saveCoordinates/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Around(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  Around(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "saveCoordinates".
   *
   * This request holds the parameters needed by the around server.  After setting any optional
   * parameters, call the {@link SaveCoordinates#execute()} method to invoke the remote operation.
   *
   * @param latitude
   * @param longitude
   * @return the request
   */
  public SaveCoordinates saveCoordinates(java.lang.String latitude, java.lang.String longitude) throws java.io.IOException {
    SaveCoordinates result = new SaveCoordinates(latitude, longitude);
    initialize(result);
    return result;
  }

  public class SaveCoordinates extends AroundRequest<Void> {

    private static final String REST_PATH = "{latitude}/{longitude}";

    /**
     * Create a request for the method "saveCoordinates".
     *
     * This request holds the parameters needed by the the around server.  After setting any optional
     * parameters, call the {@link SaveCoordinates#execute()} method to invoke the remote operation.
     * <p> {@link SaveCoordinates#initialize(com.google.api.client.googleapis.services.AbstractGoogleC
     * lientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param latitude
     * @param longitude
     * @since 1.13
     */
    protected SaveCoordinates(java.lang.String latitude, java.lang.String longitude) {
      super(Around.this, "POST", REST_PATH, null, Void.class);
      this.latitude = com.google.api.client.util.Preconditions.checkNotNull(latitude, "Required parameter latitude must be specified.");
      this.longitude = com.google.api.client.util.Preconditions.checkNotNull(longitude, "Required parameter longitude must be specified.");
    }

    @Override
    public SaveCoordinates setAlt(java.lang.String alt) {
      return (SaveCoordinates) super.setAlt(alt);
    }

    @Override
    public SaveCoordinates setFields(java.lang.String fields) {
      return (SaveCoordinates) super.setFields(fields);
    }

    @Override
    public SaveCoordinates setKey(java.lang.String key) {
      return (SaveCoordinates) super.setKey(key);
    }

    @Override
    public SaveCoordinates setOauthToken(java.lang.String oauthToken) {
      return (SaveCoordinates) super.setOauthToken(oauthToken);
    }

    @Override
    public SaveCoordinates setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SaveCoordinates) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SaveCoordinates setQuotaUser(java.lang.String quotaUser) {
      return (SaveCoordinates) super.setQuotaUser(quotaUser);
    }

    @Override
    public SaveCoordinates setUserIp(java.lang.String userIp) {
      return (SaveCoordinates) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String latitude;

    /**

     */
    public java.lang.String getLatitude() {
      return latitude;
    }

    public SaveCoordinates setLatitude(java.lang.String latitude) {
      this.latitude = latitude;
      return this;
    }

    @com.google.api.client.util.Key
    private java.lang.String longitude;

    /**

     */
    public java.lang.String getLongitude() {
      return longitude;
    }

    public SaveCoordinates setLongitude(java.lang.String longitude) {
      this.longitude = longitude;
      return this;
    }

    @Override
    public SaveCoordinates set(String parameterName, Object value) {
      return (SaveCoordinates) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link Around}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link Around}. */
    @Override
    public Around build() {
      return new Around(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link AroundRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setAroundRequestInitializer(
        AroundRequestInitializer aroundRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(aroundRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
