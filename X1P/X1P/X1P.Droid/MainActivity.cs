using System;

using Android.App;
using Android.Content;
using Android.Content.Res;
using Android.Graphics.Drawables;
using Android.Media;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

namespace X1P.Droid
{
	[Activity (Label = "X1P.Droid", MainLauncher = true, Icon = "@drawable/icon")]
	public class MainActivity : Activity
	{
		int count = 1;
        
		protected override void OnCreate (Bundle bundle)
		{

			base.OnCreate (bundle);
            
		    this.Title = "Bournovilles X1P";
            
            // Set our view from the "main" layout resource
            SetContentView (Resource.Layout.Main);
            

			// Get our button from the layout resource,
			// and attach an event to it
			Button button = FindViewById<Button> (Resource.Id.myButton);
			
			button.Click += delegate {
				button.Text = string.Format ("{0} clicks!", count++);
			};
		}
	}
}


