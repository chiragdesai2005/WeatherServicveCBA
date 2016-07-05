package com.weather.service;

import com.weather.model.ResultData;

/**
 * Sample url application and dummy data
 * {"cnt":11,"list":[{"coord":{"lon":151.21,"lat":-33.87},"sys":{"type":1,"id":8233,"message":0.0348,"country":"AU","sunrise":1467579639,"sunset":1467615524},"weather":[{"id":800,"main":"Clear","description":"Sky
 * is
 * Clear","icon":"01d"}],"main":{"temp":14.33,"pressure":1016,"humidity":54,"temp_min":12.22,"temp_max":16.11},"visibility":10000,"wind":{"speed":2.1,"deg":100,"var_beg":80,"var_end":140},"clouds":{"all":0},"dt":1467612664,"id":2147714,"name":"Sydney"},{"coord":{"lon":144.96,"lat":-37.81},"sys":{"type":1,"id":8201,"message":0.0304,"country":"AU","sunrise":1467581756,"sunset":1467616405},"weather":[{"id":803,"main":"Clouds","description":"broken
 * clouds","icon":"04d"}],"main":{"temp":11.48,"pressure":1013,"humidity":71,"temp_min":10.56,"temp_max":12},"visibility":10000,"wind":{"speed":6.2,"deg":10},"clouds":{"all":75},"dt":1467613077,"id":2158177,"name":"Melbourne"},{"coord":{"lon":138.6,"lat":-34.93},"sys":{"type":1,"id":8204,"message":0.0308,"country":"AU","sunrise":1467582825,"sunset":1467618390},"weather":[{"id":520,"main":"Rain","description":"light
 * intensity shower
 * rain","icon":"09d"}],"main":{"temp":9.85,"pressure":1010,"humidity":81,"temp_min":8.89,"temp_max":11},"visibility":10000,"wind":{"speed":9.3,"deg":210},"rain":{"1h":0.51},"clouds":{"all":75},"dt":1467612399,"id":2078025,"name":"Adelaide"},{"coord":{"lon":149.13,"lat":-35.28},"sys":{"type":1,"id":8226,"message":0.0325,"country":"AU","sunrise":1467580352,"sunset":1467615809},"weather":[{"id":741,"main":"Fog","description":"fog","icon":"50d"}],"main":{"temp":17.5,"pressure":1016,"humidity":75,"temp_min":8,"temp_max":27},"visibility":10000,"wind":{"speed":5.1,"deg":320},"clouds":{"all":44},"dt":1467611580,"id":2172517,"name":"Canberra"},{"coord":{"lon":115.83,"lat":-31.93},"sys":{"type":1,"id":8221,"message":0.0029,"country":"AU","sunrise":1467587848,"sunset":1467624297},"weather":[{"id":800,"main":"Clear","description":"Sky
 * is
 * Clear","icon":"01d"}],"main":{"temp":13.96,"pressure":1027,"humidity":47,"temp_min":13.89,"temp_max":14},"wind":{"speed":7.7,"deg":90},"clouds":{"all":0},"dt":1467612603,"id":2063523,"name":"Perth"},{"coord":{"lon":153.03,"lat":-27.47},"sys":{"type":1,"id":8164,"message":0.0034,"country":"AU","sunrise":1467578320,"sunset":1467615969},"weather":[{"id":801,"main":"Clouds","description":"few
 * clouds","icon":"02d"}],"main":{"temp":20.78,"pressure":1018,"humidity":64,"temp_min":19.44,"temp_max":22.22},"wind":{"speed":3.6,"deg":70},"clouds":{"all":20},"dt":1467612748,"id":2174003,"name":"Brisbane"},{"coord":{"lon":147.33,"lat":-42.88},"sys":{"type":1,"id":8195,"message":0.039,"country":"AU","sunrise":1467582102,"sunset":1467614923},"weather":[{"id":500,"main":"Rain","description":"light
 * rain","icon":"10d"},{"id":301,"main":"Drizzle","description":"drizzle","icon":"09d"}],"main":{"temp":7.24,"pressure":1016,"humidity":93,"temp_min":6.67,"temp_max":8},"visibility":5000,"wind":{"speed":3.1,"deg":180},"rain":{"1h":0.25},"clouds":{"all":75},"dt":1467612268,"id":2163355,"name":"Hobart"},{"coord":{"lon":144.28,"lat":-36.77},"sys":{"type":3,"id":8938,"message":0.0039,"country":"AU","sunrise":1467581748,"sunset":1467616739},"weather":[{"id":500,"main":"Rain","description":"light
 * rain","icon":"10d"}],"main":{"temp":9.66,"humidity":82,"pressure":994,"temp_min":9.4,"temp_max":10},"wind":{"speed":1.03,"gust":5.14,"deg":30},"rain":{"3h":2.18},"clouds":{"all":92},"dt":1467613042,"id":2176187,"name":"Bendigo"},{"coord":{"lon":143.85,"lat":-37.57},"sys":{"type":3,"id":1466904097,"message":0.0319,"country":"AU","sunrise":1467581982,"sunset":1467616713},"weather":[{"id":500,"main":"Rain","description":"light
 * rain","icon":"10d"}],"main":{"temp":9.4,"humidity":84,"pressure":979.2,"temp_min":9.4,"temp_max":9.4},"wind":{"speed":5.26,"deg":356.509},"rain":{"3h":0.98},"clouds":{"all":92},"dt":1467613042,"id":2177091,"name":"Ballarat"},{"coord":{"lon":151,"lat":-33.82},"sys":{"type":1,"id":8233,"message":0.0305,"country":"AU","sunrise":1467579680,"sunset":1467615580},"weather":[{"id":800,"main":"Clear","description":"Sky
 * is
 * Clear","icon":"01d"}],"main":{"temp":14.07,"pressure":1016,"humidity":54,"temp_min":11.67,"temp_max":15.56},"visibility":10000,"wind":{"speed":2.1,"deg":100,"var_beg":80,"var_end":140},"clouds":{"all":0},"dt":1467613106,"id":7281840,"name":"Paramatta"},{"coord":{"lon":149.1,"lat":-33.28},"sys":{"type":3,"id":46893,"message":0.0307,"country":"AU","sunrise":1467580059,"sunset":1467616116},"weather":[{"id":803,"main":"Clouds","description":"broken
 * clouds","icon":"04d"}],"main":{"temp":8.05,"humidity":76,"pressure":1013,"temp_min":7.78,"temp_max":8.33},"wind":{"speed":2.06,"gust":3.6,"deg":348},"rain":{"3h":0},"clouds":{"all":64},"dt":1467613098,"id":2154219,"name":"Orange"}]}
 * 
 */
public interface WeatherService {

	/**
	 * This method is responsible for calling remote web service configured in
	 * property file and get json format data
	 * 
	 * @return an object of ResultData
	 * @throws Exception
	 */
	public ResultData callWebserviceForResultData() throws Exception;

}
