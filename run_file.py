# multi_command.py

import sublime, sublime_plugin
import subprocess
import os

# Takes an array of commands (same as those you'd provide to a key binding) with
# an optional context (defaults to view commands) & runs each command in order.
# Valid contexts are 'text', 'window', and 'app' for running a TextCommand,
# WindowCommands, or ApplicationCommand respectively.
class RunFileCommand(sublime_plugin.TextCommand):
  # def exec_command(self):
  #   sublime.active_window().run_command("view_tester", "args": { "action": "make_opd", "use_debugger": false })
    
  def run(self, edit):
    self.view.insert(edit, 0, "Hello, World!")
    path = self.view.file_name()
    out = path[:-3]+"out"
    subprocess.run(["g++", "-std=c++17", path, "-o", out, "-DLOCAL", "-O2"], stdout=subprocess.DEVNULL)
    # self.window.run_command("view_tester", "args": { "action": "make_opd", "use_debugger": false })
    # self.window.run_command("build", "args": {"variant": ""})
    # self.exec_command()
    # self.window.run_command("toggle_side_bar")
    sublime.active_window().run_command("toggle_side_bar")