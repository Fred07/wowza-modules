package com.wowza.wms.plugin.module;

import com.wowza.wms.medialist.*;
import com.wowza.wms.module.*;
import com.wowza.wms.stream.*;
import com.wowza.wms.application.*;

public class ModuleAMLSTLive extends ModuleBase 
{
	class MyMediaListProvider implements IMediaListProvider
	{
		public MediaList resolveMediaList(IMediaListReader mediaListReader, IMediaStream stream, String streamName)
		{
		 	MediaList mediaList = new MediaList();

			MediaListSegment segment = new MediaListSegment();
			

			MediaListRendition rendition1 = new MediaListRendition();
			

			rendition1.setName(streamName+"_1080P");
			rendition1.setBitrateAudio(320000);
			rendition1.setBitrateVideo(4000000);
			rendition1.setWidth(1920);
			rendition1.setHeight(1080);
			
			segment.addRendition(rendition1);
			mediaList.addSegment(segment);
			
			rendition1.setAudioCodecId("mp4a.40.2");
			rendition1.setVideoCodecId("avc1.77.50");

			MediaListRendition rendition2 = new MediaListRendition();
			segment.addRendition(rendition2);

			rendition2.setName(streamName+"_720P");
			rendition2.setBitrateAudio(320000);
			rendition2.setBitrateVideo(2000000);
			rendition2.setWidth(1280);
			rendition2.setHeight(720);
			rendition2.setAudioCodecId("mp4a.40.2");
			rendition2.setVideoCodecId("avc1.77.32");
 
			MediaListRendition rendition3 = new MediaListRendition();
			segment.addRendition(rendition3);

			rendition3.setName(streamName+"_480P");
			rendition3.setBitrateAudio(128000);
			rendition3.setBitrateVideo(1000000);
			rendition3.setWidth(854);
			rendition3.setHeight(480);
			rendition3.setAudioCodecId("mp4a.40.2");
			rendition3.setVideoCodecId("avc1.77.40");

			MediaListRendition rendition4 = new MediaListRendition();
			segment.addRendition(rendition4);

			rendition4.setName(streamName+"_360P");
			rendition4.setBitrateAudio(96000);
			rendition4.setBitrateVideo(400000);
			rendition4.setWidth(640);
			rendition4.setHeight(360);
			rendition4.setAudioCodecId("mp4a.40.2");
			rendition4.setVideoCodecId("avc1.77.31");

			return mediaList;
		}
	}

	public void onAppStart(IApplicationInstance appInstance)
	{
		appInstance.setMediaListProvider(new MyMediaListProvider());
	}
}