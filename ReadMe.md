IJ-Plugins Bundle
=================

This project is used to create distribution bundle of the [IJ-Plugins] for [ImageJ] and [FIJI]/[ImageJ 2].

The bundle contains projects:

* [IJP-Toolkit] - the original core of the IJ-Plugins. Enables image segmentation (k-means, Seeded Region Growing),
  reading/writing 2D formats (MetaImage, VTK), color conversion (XYZ, L\*a\*b\*, YCrCb), color/band measurement, very
  fast median, various anisotropic diffusion filters, texture synthesis.
* [IJP-Color] - Color calibration/standardization using color charts and operations on color spaces.
* [IJP-DeBayer2SX] - Demasaicing (Bayer patter reconstruction) of raw images for better control over captured image
  color and detail quality.
* [IJP-ImageIO] - extends support for reading and writing images using codes implemented by Java ImageIO, for instance,
  writing compressed TIFF.

_Note_: all individual projects can be installed separately, see their respective Releases pages. The bundle is intended
to help to install all of them at once and remove mixed dependent JAR collisions.

**_Note_: IJP-Color require Java 11 or newer**. 
Both [ImageJ] and [FIJI]/[ImageJ 2] can run with Java 11 and newer. 
If you need JavaScript support you should not use Java newer than 11.
JavaScript is still supported in Java 11.

Installation
------------

### ImageJ

For [ImageJ] the IJ-Plugins Bundle is provide as a ZIP file on the [Releases] page. The ZIP is specific to your
operating system. For instance for Windows 10, the name will end with "-win". To install unzip the bundle, for
instance "ij-plugins_1.0.0-win.zip", in the ImageJ's plugins folder, it will create a folder named `ij-plugins`, and
restart ImageJ.

### FIJI

In [Fiji]/[ImageJ 2] the IJ-Plugins Bundle can be installed through
the [IJ-Plugins Update Site]: "https://sites.imagej.net/IJ-Plugins/"

You will need Java 11 to use [IJP-Color] plugins. 
Instructions for using Fiji with Java 11 and newer are at the [IJP-ImageJ-Launcher] page. 

Steps:

1. Select `Help` > `Update` and wait for update to finish.
2. Click on `Manage update sites`.
3. Click on `Add update site`.
4. Under `Name` type "IJ-Plugins", under `URL` type "https://sites.imagej.net/IJ-Plugins/". Make sure that the check box
   next to the name "IJ-Plugins" is selected. Click `Close`
5. Click on `Apply changes`
6. Restart ImageJ

Tips and Troubleshooting
------------------------

### Use Java 11 or Newer

Some of IJ Plugins expect to tun with current Java distribution, version 11 or newer. 
While effort is made to support obsolete Java 8 used by FIJI/ImageJ 2 distribution, 
some plugins may not work correctly. 

[IJP-ImageJ-Launcher] page provides an updated launcher and detailed instructions how to run [FIJI]/[ImageJ 2] with Java 11 or newer.

### Tip: ImageJ main window may shrink when using some plugins on Windows 10

When using `IJP Color Calculator` or `IJP Color Calibrator` plugins the main ImageJ window may shrink (change size) if
your monitor is using scaling other than 100%. This may also happen to other windows opened by ImageJ. If that happens:

1. In Windows Explorer, go to your FIJI installation directory
2. Right click on `ImageJ-win64.exe` and select "Properties"
3. Select "Compatibility" tab and click on "Change high DPI settings"
4. Select two check marks and select "System (Enhanced)" as indicated in the image below, click "OK", then restart FIJI

![Windows DPI Settings](doc/Windows_DPI_Settings.png)


[Releases]: https://github.com/ij-plugins/ij-plugins-bundle/releases

[IJ-Plugins Update Site]: https://sites.imagej.net/IJ-Plugins/

[ImageJ]:         https://imagej.nih.gov/ij/

[ImageJ 2]:       http://imagej.net

[IJP-ImageJ-Launcher]: https://github.com/ij-plugins/ijp-imagej-launcher

[FIJI]:           https://imagej.net/Fiji

[IJ-Plugins]:     https://github.com/ij-plugins

[IJP-Color]:      https://github.com/ij-plugins/ijp-color

[IJP-DeBayer2SX]: https://github.com/ij-plugins/ijp-DeBayer2SX

[IJP-ImageIO]:    https://github.com/ij-plugins/ijp-imageio/wiki

[IJP-Toolkit]:    https://github.com/ij-plugins/ijp-toolkit/wiki