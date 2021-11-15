from conf import SAMPLE_INPUTS, SAMPLE_OUTPUTS
from moviepy.editor import *  # ImageClip
from PIL import Image, ImageSequence

thumbnail_dir = os.path.join(SAMPLE_OUTPUTS, "thumbnails")
thumbnail_per_frame_dir = os.path.join(SAMPLE_OUTPUTS, "thumbnails-per-frame")
thumbnail_per_half_second_dir = os.path.join(SAMPLE_OUTPUTS, "thumbnails-per-half-second")
output_video = os.path.join(SAMPLE_OUTPUTS, 'thumbs.mp4')

this_dir  = os.listdir(thumbnail_dir)
file_paths = [os.path.join(thumbnail_dir, fname) for fname in this_dir if fname.endswith('jpg')]


file_paths = []
for fname in this_dir:
    if fname.endswith('jpg'):
        path = os.path.join(thumbnail_dir, fname)
        file_paths.append(path)

print(file_paths)
clip = ImageSequenceClip(file_paths, fps=1)
clip.write_viddeofile(output_video)


directory = {}

for root, dirs, files in os.walk(thumbnail_per_frame_dir):
    for fname in files:
        filepath = os.path.join(root, fname)
        try:
            key = float(fname.replace('.jpg', ''))
        except:
            key = None
        if key is not None:
            directory[key] = filepath

new_paths = []
for k in sorted(directory.keys())
    filepath = directory[k]
    new_paths.append(filepath)


# clip = ImageSequenceClip(new_paths, fps=10)
# clip.write_videofile(output_video)

my_clips = []
for path in list(new_paths):
    frame = ImageClip(path)
    # print(fname.img) # numpy array
    my_clips.append(frame.img)


clip = ImageSequenceClip(my_clips, fps=22)
clip.write_videofile(output_video)