
package com.amazon.dataloader.network.model.request;

import okhttp3.MediaType;
import okhttp3.RequestBody;

public class VideoListRequest {

    public static String authoriztion = "Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE2MDU2MDMyODAsImlkIjoidXM5M2I0MmE5NCIsImlhdCI6MTYwNTU5MjQ4MH0.ODw9DTJbT8zuQrLStcoHMTxs1Bn6hoJf50FLp1KRM_Kymmc696uaE8daq0M0MoebtQltqrmtmpT2BSKuyX8JhyAhbw48VMqp1GIPlIXrsCz06fUj1UKliucURg8DwYn9Iw-hqKUhc5nHaki-1jH1SZYanogw_NUrQw1rEokapEvW7r08tZMlri9DPIQ1zYRTwpDDAx49tbAUXqDpAypK3v35zNwG8YT6bVL00tXdWFZ3t7OsVaXFqUJDBU0Z0o2qm2dB97_Cgh_V_LBrW8Whm8t2kgoWmswigZCYZynHRxQRKQy3KZSY1Pu3jgbbpqO5q7WLxIK3g1-N-O_FuAURaXjTEXVX7-3foq7U84vtfO6xxG4ThpN3IKN-8nr-LeErm6iDsvUwvL4F_a1B0aj0z9zR9skcd-jgRZWhvSAlbMAsOUI5ltawm354_xYp7vNlvt6WO15aMKsKcsvC_RndwaGhAHBkcNd_dgc8SBWcwKLXOlhxylFRi_gSxvWEwg3HCClTzhYAqUYgPlQ4qtzL3SVx8W04hAGt1wdIPQBWvzSKEiHobX0GbQq-0v_xkMiT36_lbTZzzGX7fNTVvQMVipZddO8aztpr-3s8p6XS7vi0sgQSSTbumAuHS1h-XmdC_-mS-_UTNIRHnQ5ygEOBfsxSvjkTr7ihRUuqTM9GnqU";

    private String requestJson = "{\n" +
            "        \"$language\": \"en\",\n" +
            "        \"$id\": \"clba7420a9\",\n" +
            "        \"allVideos\": {\n" +
            "            \"id\": true,\n" +
            "            \"title\": true,\n" +
            "            \"published\": true,\n" +
            "            \"date\": true,\n" +
            "            \"type\": true,\n" +
            "            \"sport\": {\n" +
            "                \"id\": true,\n" +
            "                \"title\": true,\n" +
            "                \"$list\": {\n" +
            "                    \"$find\": {\n" +
            "                        \"$traverse\": \"ancestors\",\n" +
            "                        \"$filter\": {\n" +
            "                            \"$field\": \"type\",\n" +
            "                            \"$operator\": \"=\",\n" +
            "                            \"$value\": \"team\"\n" +
            "                        },\n" +
            "                        \"$find\": {\n" +
            "                            \"$traverse\": \"ancestors\",\n" +
            "                            \"$filter\": [{\n" +
            "                                \"$field\": \"type\",\n" +
            "                                \"$operator\": \"=\",\n" +
            "                                \"$value\": \"sport\"\n" +
            "                            }, {\n" +
            "                                \"$field\": \"published\",\n" +
            "                                \"$operator\": \"=\",\n" +
            "                                \"$value\": true\n" +
            "                            }]\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            },\n" +
            "            \"categories\": {\n" +
            "                \"id\": true,\n" +
            "                \"title\": true,\n" +
            "                \"aliases\": true,\n" +
            "                \"$list\": {\n" +
            "                    \"$find\": {\n" +
            "                        \"$traverse\": \"ancestors\",\n" +
            "                        \"$filter\": {\n" +
            "                            \"$field\": \"type\",\n" +
            "                            \"$operator\": \"=\",\n" +
            "                            \"$value\": \"category\"\n" +
            "                        }\n" +
            "                    }\n" +
            "                }\n" +
            "            },            \n" +
            "            \"subItems\": {\n" +
            "                  \"id\": true,\n" +
            "                  \"title\": true,\n" +
            "                  \"image\": true,\n" +
            "                  \"published\": true,\n" +
            "                  \"video\": true,\n" +
            "                  \"categories\": {\n" +
            "                      \"id\": true,\n" +
            "                      \"title\": true,\n" +
            "                      \"aliases\": true,\n" +
            "                      \"$list\": {\n" +
            "                          \"$find\": {\n" +
            "                              \"$traverse\": \"ancestors\",\n" +
            "                              \"$filter\": {\n" +
            "                                  \"$field\": \"type\",\n" +
            "                                  \"$operator\": \"=\",\n" +
            "                                  \"$value\": \"category\"\n" +
            "                              }\n" +
            "                          }\n" +
            "                      }\n" +
            "                  },      \n" +
            "                  \"$list\": {\n" +
            "                    \"$find\": {\n" +
            "                      \"$traverse\": \"children\",\n" +
            "                      \"$filter\": [\n" +
            "                        {\n" +
            "                          \"$field\": \"type\",\n" +
            "                          \"$operator\": \"=\",\n" +
            "                          \"$value\": \"video\"\n" +
            "                         }\n" +
            "                      ]\n" +
            "                    }\n" +
            "                  }\n" +
            "                },\n" +
            "            \"image\": true,\n" +
            "            \"video\": true,\n" +
            "            \"$list\": {\n" +
            "                \"$limit\": 20,\n" +
            "                \"$offset\": 0,\n" +
            "                \"$find\": {\n" +
            "                    \"$traverse\": \"descendants\",\n" +
            "                    \"$filter\": \n" +
            "            [{\"$field\": \"type\",\"$operator\": \"=\",\"$value\": \"match\",\"$or\": {\"$field\": \"type\",\"$operator\": \"=\",\"$value\": \"event\",\"$or\": {\"$field\": \"type\",\"$operator\": \"=\",\"$value\": \"video\"}}}, {\"$field\": \"end\",\"$operator\": \"<\",\"$value\": 1605592687376}]\n" +
            "                },\n" +
            "                \"$sort\": {\n" +
            "                    \"$field\": \"date\",\n" +
            "                    \"$order\": \"desc\"\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }\n";


    public RequestBody getRequestBody() {
        return RequestBody.create(MediaType.parse("application/json"), requestJson);
    }

}
